package hp.epc;



import java.util.List;

public class Token {

    private String fq_tenant_id;

    private String nbf;

    private String group_policy;

    private String policy_id;

    private String scope;

    private String iss;
    private List<Tenant> tenants;

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getStratus_id() {
        return stratus_id;
    }

    public void setStratus_id(String stratus_id) {
        this.stratus_id = stratus_id;
    }
//private List<String> access_policies;

    private String exp;

    private String iat;

    private String jti;

    private String client_id;

    public String getIdp_id() {
        return idp_id;
    }

    public void setIdp_id(String idp_id) {
        this.idp_id = idp_id;
    }

    private  String idp_id;

    private  String tenant_id;

    private  String stratus_id;

    //private AccessPolicies  accp;
	/*
	public AccessPolicies getAccp() {
		return accp;
	}

	public void setAccp(AccessPolicies accp) {
		this.accp = accp;
	}
*/
    public String getFq_tenant_id() {
        return fq_tenant_id;
    }

    public void setFq_tenant_id(String fq_tenant_id) {
        this.fq_tenant_id = fq_tenant_id;
    }

    public String getNbf() {
        return nbf;
    }

    public void setNbf(String nbf) {
        this.nbf = nbf;
    }

    public String getGroup_policy() {
        return group_policy;
    }

    public void setGroup_policy(String group_policy) {
        this.group_policy = group_policy;
    }

    public String getPolicy_id() {
        return policy_id;
    }

    public void setPolicy_id(String policy_id) {
        this.policy_id = policy_id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }
    /*
        public List<String> getAccess_policies() {
            return access_policies;
        }

        public void setAccess_policies(List<String> access_policies) {
            this.access_policies = access_policies;
        }
    */
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getIat() {
        return iat;
    }

    public void setIat(String iat) {
        this.iat = iat;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }





    // Getters and setters
    public List<Tenant> getTenants() {
        return tenants;
    }

    public void setTenants(List<Tenant> tenants) {
        this.tenants = tenants;
    }

}
