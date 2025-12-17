package com.utttara.epc;

import java.util.List;

public class Tenant {
    private List<String> roles;
    private String tenant_fqid;
    private String tenant_id;

    // Getters and setters
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getTenant_fqid() {
        return tenant_fqid;
    }

    public void setTenant_fqid(String tenant_fqid) {
        this.tenant_fqid = tenant_fqid;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }
}
