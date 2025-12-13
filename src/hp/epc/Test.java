package hp.epc;

import static org.springframework.security.oauth.common.OAuthCodec.oauthEncode;

import java.io.IOException;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.URLCodec;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;


public class Test {
    public static final String EXPECTED_ISSUER_URL = "https://stage.authz.wpp.api.hp.com/";
      public static void main(String[] args) {
        Test test = new Test();
        String ocToken="eyJhbGciOiJSUzI1NiIsImtpZCI6IjE5MGE4ZDMwLTYzZTAtNDFkMC04ZWQyLTBkMTMzYjVhZDY0NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiaHR0cHM6Ly9hZ2dyZWdhdGlvbi1yZWxhdGlvbnNoaXAuc3RnLm9jLmhwLmNvbSIsImh0dHBzOi8vb3JnYW5pemF0aW9uLWlkZW50aXR5LnN0Zy5vYy5ocC5jb20iLCJodHRwczovL3N0cmF0dXMtYnJpZGdlLWV4dGVuc2liaWxpdHkuc3RnLm9jLmhwLmNvbSIsImh0dHBzOi8vdXNlci1pZGVudGl0eS5zdGcub2MuaHAuY29tIiwiaHR0cHM6Ly9hZGRyZXNzLWlkZW50aXR5LnN0Zy5vYy5ocC5jb20iLCJodHRwczovL2NvbnNlbnQtZGF0YW1hbmFnZW1lbnQuc3RnLm9jLmhwLmNvbSIsImh0dHBzOi8vZW1zLWFwaS1pbnRlZ3JhdGlvbnMuc3RnLm9jLmhwLmNvbSIsImh0dHBzOi8vZW1zLXNjaGVtYS1yZWdpc3RyeS1hcGktaW50ZWdyYXRpb25zLnN0Zy5vYy5ocC5jb20iLCJodHRwczovL2lkcC1jb25maWctYXV0aC5zdGcub2MuaHAuY29tIiwiaHR0cHM6Ly9pZHAtbG9va3VwLWF1dGguc3RnLm9jLmhwLmNvbSIsImh0dHBzOi8vaWRwLXRva2VubWdtdC1hdXRoLnN0Zy5vYy5ocC5jb20iLCJodHRwczovL21ldGFkYXRhLWFwaS1kYXRhbWFuYWdlbWVudC5zdGcub2MuaHAuY29tIiwiaHR0cHM6Ly9tdmMtYXBpLWRhdGFtYW5hZ2VtZW50LnN0Zy5vYy5ocC5jb20iLCJodHRwczovL3JlZ2lzdHJ5LXJlbGF0aW9uc2hpcC5zdGcub2MuaHAuY29tIiwiaHR0cHM6Ly9yb2xlcy1yZWxhdGlvbnNoaXAuc3RnLm9jLmhwLmNvbSJdLCJhdXRoX3RpbWUiOjEuNzQ0ODEwNzE5ZSswOSwiYXV0aG9yaXphdGlvbl9kZXRhaWxzIjpbXSwiY2lkIjoiZGExODQwMWUtZjhmZC00ZmUxLThjYjItYjU4OTQ4NGUyZmM4IiwiZXhwIjoxNzQ0ODE0MzU4LCJleHRlcm5hbE9yZ1JlZklEcyI6W10sImV4dGVybmFsVXNlclJlZklEcyI6W3siZXh0ZXJuYWxfZGF0YSI6e30sInR5cGUiOiJFWFRFUk5BTF9VU0VSX0lERU5USUZJRVJfVFlQRV9TVFJBVFVTIiwidmFsdWUiOiI2MzBjN2Y3OTNjNWM5MTdlOWNkOGEzYWUifV0sImlhdCI6MTc0NDgxMDc1OCwiaWRwX3R5cGUiOiJocGlkIiwiaWRwX3VzZXJfaWQiOiJvanllb2o1dHhpOGFhM3FpOWk1b3RoNmFoZm03c204NCIsImlkdHlwIjoidXNlciIsImlzcyI6Imh0dHBzOi8vb2F1dGgtYXV0aC5zdGcub2MuaHAuY29tL29hdXRoMi92MS9ocG9jLXN0ZyIsImp0aSI6IjM1OTMzZjBiLWRkN2YtNDc0Ni1iZGY5LTc0ZWM4M2I2YWUyNCIsInByb2pfcmVmIjoiIiwic2EiOiIiLCJzY3AiOlsib3BlbmlkIiwib2ZmbGluZSJdLCJzdWIiOiIwYmJmZTE1YS1iNjgwLTRjZjEtODYzNS01ZWNjNjZlNGUxYWEiLCJ0ZW5hbnRzIjpbeyJvbl9iZWhhbGZfb2YiOltdLCJwZXJtaXNzaW9uX21hc2tzIjpbXSwicm9sZXMiOlsiNzYwZDRlODMtYjRlMy00NjA2LWI2ZTctYzhmMDc2ZGRmZmY0Il0sInRlbmFudF9mcWlkIjoiNWMxYzI1NDdiZjk2NWRlZTAwNDY1YTNiL2FiMGUwMTlkLTAzMjItNGZmYy1iMDYwLTYwNjExZWU3MmIyNyIsInRlbmFudF9pZCI6ImFiMGUwMTlkLTAzMjItNGZmYy1iMDYwLTYwNjExZWU3MmIyNyJ9XX0.HbmjUxr8EyCTmyvZlTTPUIkznA8cRyvY0atH_621Jeg8u-FM_RLIpVpX5TAvhyyLcQtrrgKiofOamk4sSRl32gCIudzvEs87DM9ArDqU6cJF7T2KhM8g_ce9zJ6Y1_JG_BgZT1nE1jsy3n0UNaPho_l43FiaPCe46XehaaT_WZgKp6GGLzQJ7SB7WJToHOL3CPUfH6xwscz8w1rDmvYkygEXGxNUnxH2gtT3-v68vlknKqLF9DwHLfgCeOVqFHgmv5LNceQhEdnT6uNiGddFjE1Uwq84Uc5pHw3pJGO-Q_QLLh4f-ib1vt_r000TA4e3d-YaMurSdrYPFuJLJkY-lQ";
        String authzToken="eyJraWQiOiJzdGFnZS1hdXRoei0xNjk2OTM1ODczIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJveXB3bTR4c3dzcmpxZXd6c3FuamVkcmE2MWdmOGhxYiIsImdyb3VwX3BvbGljeSI6IlJlYWRTdWJzY3JpcHRpb25zUGVuZGluZ0NoYW5nZXMsTWFuYWdlT3duTWFya3MsTWFuYWdlU3Vic2NyaXB0aW9uc1N0YXRlU3Vic2NyaXB0aW9ucyxXcml0ZUVkZ2UsU2VjdXJpdHlBc3Nlc3NtZW50UmVhZCxSZWFkT3V0c3RhbmRpbmdCYWxhbmNlcyxSZWFkRGV2aWNlcyxQcmludE9uVGhlR29QcmludCxGdWxsQ29sbGVjdGlvbkFjY2VzcyxNYW5hZ2VEZXZpY2VzQml6TW9kZWwsUmVhZEV4cGVyaW1lbnRzLE1hbmFnZVNlbGYsU2VjdXJpdHlBc3Nlc3NtZW50TWFuYWdlLFJlYWRFZGdlLEphcnZpc0Zpcm13YXJlVXBkYXRlQ29uZmlnLERlbGV0ZVN1YnNjcmlwdGlvbnNQZW5kaW5nQ2hhbmdlcyxNYW5hZ2VGaXJtd2FyZVVwZGF0ZXMsUmVhZEFjY291bnRzLFJlYWRPd25TaG9ydGN1dHMsUmVhZEJlbmVmaXRzLE1hbmFnZUFzc2V0cyxXcml0ZVZlcnRleCxQcmludE9uVGhlR29NYW5hZ2UsQ2xpZW50VGVsZW1ldHJ5UHVibGlzaGVyLE1hbmFnZURldmljZVRyYW5zZmVyLFJlYWREZXZpY2VUcmFuc2ZlcixSZWFkU3Vic2NyaXB0aW9uc1N0YXRlU3Vic2NyaXB0aW9ucyxNYW5hZ2VSZWZ1bmRzLFJldHVybnNTdmMsTWVyZ2VEb2N1bWVudHMsUmVhZFN1YnNjcmlwdGlvbnMsTWFuYWdlQWRkcmVzcyxSZWFkQWRkcmVzcyxNYW5hZ2VTdWJzY3JpcHRpb25zUGVuZGluZ0NoYW5nZXMsTWFuYWdlUGF5bWVudE1ldGhvZENvbnRyb2xsZXIsRGVsZXRlT3V0c3RhbmRpbmdCYWxhbmNlcyxVY2RlU3VwcG9ydCxSZWFkQWNjb3VudERhdGEsTWFuYWdlVXNlcnMsUmVhZFZlcnRleCxEZWxldGVTdWJzY3JpcHRpb25zU3RhdGVTdWJzY3JpcHRpb25zLFdyaXRlR29vZ2xlQWN0aXZhdGlvbixNYW5hZ2VQYWFzU3Vic2NyaXB0aW9ucyxSZWFkR3JhbnRzLFJlYWRVc2VyUHJlZmVyZW5jZXMsSXBwSm9iQ2FwYWJpbGl0aWVzLE1hbmFnZVN1YnNjcmlwdGlvbnMsUmVhZERldmljZXNTdXBwbGllcyxNYW5hZ2VBY2NvdW50cyxNYW5hZ2VIcHhBZGRyZXNzLE1hbmFnZUJlbmVmaXRzLFByaW50T25UaGVHb1JlYWQsUmVhZEFzc2V0cyxQZXJmZWN0UHJpbnQsUmVhZE93bk1hcmtzLE1hbmFnZU91dHN0YW5kaW5nQmFsYW5jZXMsV3JpdGVSZXdhcmRzLE1hbmFnZVVzZXJQcmVmZXJlbmNlcyxNYW5hZ2VPd25TaG9ydGN1dHMsUmVhZFVzZXJzLFJlYWRDYXRhbG9nLFJlYWREZXZpY2VzUnRwLE1hbmFnZURldmljZXMsUmVhZFBlcm1pc3Npb25TZXQsUmVhZFJld2FyZHMiLCJ3cGlkIjoib3lwd200eHN3c3JqcWV3enNxbmplZHJhNjFnZjhocWIiLCJpc3MiOiJodHRwczovL3N0YWdlLmF1dGh6LndwcC5hcGkuaHAuY29tLyIsImFjY2Vzc19wb2xpY2llcyI6eyI1YzFjMjU0N2JmOTY1ZGVlMDA0NjVhM2IvYzFhNDY5ODctY2JkMy00NWRiLWI5NGEtYTY1NDQxMTZmYzJkLzRjNTJjNzY0LTY5ZjYtNGI5YS1iYzk5LTNmZjU4YThkM2VjYyI6ImJmM2M1NTEwZDQ5ZWRkMjI5YzRiMTdlMDdjMTIwNjdlNTBhYzNkMmQiLCI1YzFjMjU0N2JmOTY1ZGVlMDA0NjVhM2IiOiIzNjk2NDkzYWFiNjNiZWM5ZDBiMzEyYmJiZTNhODg5YzQwYjYyYzA1In0sImNsaWVudF9pZCI6ImY3MzBjYWU3ZmUwZTQzMDc5M2JkZThiMmQ0NmZjZjk1IiwiY2FfZXhwIjoxNzQ0NzgyMTA4LCJpc192M191c2VyTWdtdEZsb3ciOnRydWUsImZxX3RlbmFudF9pZCI6IjVjMWMyNTQ3YmY5NjVkZWUwMDQ2NWEzYi9jMWE0Njk4Ny1jYmQzLTQ1ZGItYjk0YS1hNjU0NDExNmZjMmQvNGM1MmM3NjQtNjlmNi00YjlhLWJjOTktM2ZmNThhOGQzZWNjIiwibmJmIjoxNzQ0NzgxMjA4LCJhenAiOiJmNzMwY2FlN2ZlMGU0MzA3OTNiZGU4YjJkNDZmY2Y5NSIsInNjb3BlIjoiamVlcy5ocC5jb20vam9icyBzZXNzaW9uLndwcC5hcGkuaHAuY29tL3Nlc3Npb24uYWxsIHN0b3JhZ2VzZXJ2aWNlLndwcC5hcGkuaHAuY29tL2ZpbGUuY3JlYXRlIGF2ZGxzLndwcC5hcGkuaHAuY29tL3RlbmFuY3kuaW5mby51cGRhdGUgd3BwLmFwaS5ocC5jb20vYmFzaWMgZGF0YWJyaWRnZS5hcGkuaHAuY29tL3ByaW50ZXIuY29tbXVuaWNhdGUuYWxsIG9mZmxpbmVfYWNjZXNzIGF2cmVnLndwcC5hcGkuaHAuY29tL3ByaW50ZXIuaW5mby5yZWFkIGVtYWlsIGRjcy53cHAuYXBpLmhwLmNvbS9vd25lcnNoaXAucmVhZCBkY3Mud3BwLmFwaS5ocC5jb20vb3duZXJzaGlwLmRldGFpbCBkY3Mud3BwLmFwaS5ocC5jb20vZGV2aWNlLmlkZW50aXR5IGFtcy53cHAuYXBpLmhwLmNvbS9hdXRob3JpemUgZW1haWxjb25maWcud3BwLmFwaS5ocC5jb20vZW1haWwucmVhZCBvcGVuaWQgd3BwLmFwaS5ocC5jb20vZGV2aWNlLmxvb2t1cCBzZXJ2aWNlZGlzY292ZXJ5LmhwLmNvbS9zZXJ2aWNlLmRpc2NvdmVyIHNpZXJyYS53cHAuYXBpLmhwLmNvbS9yZW5kZXIgYW1zLndwcC5hcGkuaHAuY29tL2RldmljZS5jb25maWd1cmUgamVlcy5ocC5jb20vY29uc2VudCB2cGRldmljZS53cHAuYXBpLmhwLmNvbS9wcmludGVyLmFsbCBodHRwczovL3NkbS5hcGkuaHAuY29tL2RvY3VtZW50cy53cml0ZSBkY3Mud3BwLmFwaS5ocC5jb20vb3duZXJzaGlwIGF2cmVnLndwcC5hcGkuaHAuY29tL3ByaW50ZXIudmFsaWRhdGUgaHR0cHM6Ly9zZG0uYXBpLmhwLmNvbS9saW5rcy53cml0ZSIsImV4cCI6MTc0NDg2NzYwOCwiaWF0IjoxNzQ0NzgxMjA4LCJqdGkiOiJkMTMzNDk2OC02ZjQyLTRjMzktYWVlYS0xOTMzZDk3Njk5NGZfQVQifQ.kHnWXRTqnIA7dCcZI4253I4AN-OBQRRvSMXbUE7SOoizex0y8lVJvmakwgOJyYZPuYpB1IxheTUgoT4WklzS29DKwQCoR-QNPlGKpDSZV2gYvM8vY7VqBMovUmijE7v8EQp5FdndbKk1iQa7AoTHeZyiByjSYlBasX3mDHzHHEytCJJ_1Tw38HzY9OCE6vp7s25eV9HxZSpyx-SxwQSoelRbzpm0du_QWZWj1ztG1w893Ovywqog0vWQE_ID-s0t1sxUvzopV592idc576QacuZinAh9qtJ7Z3umKOsYLP8oLZ09fL6LyVeZKGTSfwKvl87xlfFJxjKXrqqA6YihvA";
        Token token = test.getTenantIdFromToken("bearer "+authzToken);

        System.out.println("iss : "+token.getIss());
        String expected_issuer = EXPECTED_ISSUER_URL;
        if(token.getIss().equals(expected_issuer)) {//AUTHZ
            System.out.println("========== AUTHZ TOKEN stratus TENAT_ID GENERATION BLOCK ==============");
            String accountId=token.getFq_tenant_id();
            String[] split_accountId = accountId.split("/");
            String tenantId = split_accountId[split_accountId.length - 1];
            System.out.println("tenantId : "+tenantId);
        } else {//OC
            System.out.println("========== OC TOKEN stratus TENAT_ID GENERATION BLOCK ==============");
          Optional<String> tenant_id =  token.getTenants().stream().map(tenant -> tenant.getTenant_fqid()).findFirst();
          if(tenant_id.isPresent()) {
              System.out.println("tenant_id : "+tenant_id.get());
          } else {
             throw new RuntimeException("Tenant ID not found");
          }

        }
    }
    public Token getTenantIdFromToken(String token) {
        try {
            if (token != null && token.trim().length() > 0) {
                String[] tokens = token.split(" ");
                if (tokens.length == 2 && ("bearer".equalsIgnoreCase(tokens[0]))) {
                    String[] split_string = tokens[1].split("\\.");
                    String base64EncodedHeader = split_string[0];
                    String base64EncodedBody = split_string[1];
                    String base64EncodedSignature = split_string[2];
                    Base64 base64Url = new Base64(true);
                    String header = new String(base64Url.decode(base64EncodedHeader));
                    String body = new String(base64Url.decode(base64EncodedBody));
                    ObjectMapper mapper = new ObjectMapper();
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    Token tp = mapper.readValue(body, Token.class);
                    return tp;
                }
            }

        } catch (JsonMappingException e) {
            e.printStackTrace();

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
//    public static void main(String args[])
//    {
//        String value = "1127bda2-6e76-102d-92b0-12313d008df2%26FrZnMs9QkL054Fiebe3UFladr8ONg5ewXkf%252Fo40CGpk%253D";
//        String value1 = oauthEncode(value);
//        System.out.println("Encoded value: " + value1);
//
//    }

}

