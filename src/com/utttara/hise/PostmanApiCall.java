package com.utttara.hise;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostmanApiCall {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://hiss-ext-stage1.hpeprint.com/hise/credentials/"))
                .header("Content-Type", "application/vnd.hp.cloud.eprint.papi.services.hise.0.85.credentials+xml")
                .header("Authorization","Bearer")
                .POST(HttpRequest.BodyPublishers.ofString("{<credentials>\n" +
                        "    <serviceName>urn:hp:cloud:eprint:papi:services:hise</serviceName>\n" +
                        "    <apiVersion>0.8</apiVersion>\n" +
                        "    <credentialEnvelop>\n" +
                        "        <cloudPrinterId>{{printerId}}</cloudPrinterId>\n" +
                        "        <credentialId>666666</credentialId>\n" +
                        "        <credentialMessage>\n" +
                        "            <subscriptionServiceName>Hy:Gem1</subscriptionServiceName>\n" +
                        "            <subscriptionVersion>0.86</subscriptionVersion>\n" +
                        "            <cloudPrinterId>{{printerId}}</cloudPrinterId>\n" +
                        "            <credSeqNum>35</credSeqNum>\n" +
                        "            <signedInfo>\n" +
                        "                <signedCredSeqNum>34</signedCredSeqNum>\n" +
                        "                <deviceImmutableId>CN678B+SN1987283767BN+0060BE123456</deviceImmutableId>\n" +
                        "                <oop>300</oop>\n" +
                        "                <vlop>20</vlop>\n" +
                        "                <lop>80</lop>\n" +
                        "                <rrtp>100</rrtp>\n" +
                        "                <subscriptionStatus>registeredCurrent</subscriptionStatus>\n" +
                        "                <oope>50</oope>\n" +
                        "                <oopePin>5678</oopePin>\n" +
                        "                <deviceStatusKey>cHJpbnRlci1zdGF0dXMta2V5LXNhbXBsZQ==</deviceStatusKey>\n" +
                        "                <subscriptionId>1000</subscriptionId>\n" +
                        "                <serviceViolation>none</serviceViolation>\n" +
                        "                <signature>\n" +
                        "                    <signatureTemplateId>f8e90d70-05ac-499f-b1be-2e5ab0ba8446</signatureTemplateId>\n" +
                        "                    <publicKeyId>08130b1a-808f-4568-947c-44d2e719fbd7</publicKeyId>\n" +
                        "                    <signatureValue>TVRJek5EVTJOemc1UVVKRFJFVkdNREV5TXpRMU5qYzRP VUZDUTBSRlJqQXhNak0wTlRZM09EbEJRa05FUlVZd01USXpORFUyTnpnNVFV SkRSRVZHTURFeU16UTFOamM0T1VGQ1EwUkZSakF4TWpNME5UWTNPRGxCUWtO RVJVWXdNVEl6TkRVMk56ZzVRVUpEUkVWR01ERXlNelExTmpjNE9VRkNRMFJG UmpBeE1qTTBOVFkzbk9EbEJRa05FUlVZd01USXpORFUyTnpnNVFVSkRSRVZH TURFeU16UTFOamM0T1VGQ1EwUkZSakF4TWpNMG5OVFkzT0RsQlFrTkVSVVl3 TVRJek5EVTJOemc1UVVKRFJFVkdNREV5TXpRMU5qYzRPVUZDUTBSRlJqQXhu TWpNME5UWTNPRGxCUWtORVJVWXdNVEl6TkRVMk56ZzVRVUpEUkVWR01B</signatureValue>\n" +
                        "                    <digest>GtHnGD/8xWSkqZzaLdEXrZX7pfjzDznSabfvIKM5Geg=</digest>\n" +
                        "                    <state>active</state>\n" +
                        "                </signature>\n" +
                        "            </signedInfo>\n" +
                        "            <messagePending>false</messagePending>\n" +
                        "            <messagePendingSeqNum>35</messagePendingSeqNum>\n" +
                        "            <communicationInterval>1440</communicationInterval>\n" +
                        "            <communicationIntervalUi>4320</communicationIntervalUi>\n" +
                        "            <credentialAcknowledgement>false</credentialAcknowledgement>\n" +
                        "            <snapshotDate>2012-04-01T00:00:00.0Z</snapshotDate>\n" +
                        "            <snapshotDate>2012-04-15T00:00:00.0Z</snapshotDate>\n" +
                        "            <supplyReplacement>\n" +
                        "                <rank>1</rank>\n" +
                        "                <uid>MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI=</uid>\n" +
                        "                <colorTriggers>\n" +
                        "                    <color>K</color>\n" +
                        "                    <requestSupplyFulfillment>1200</requestSupplyFulfillment>\n" +
                        "                    <inkLevelTrigger>1000</inkLevelTrigger>\n" +
                        "                </colorTriggers>\n" +
                        "                <state>noPlanToTrigger</state>\n" +
                        "            </supplyReplacement>\n" +
                        "            <supplyReplacement>\n" +
                        "                <rank>2</rank>\n" +
                        "                <uid>cXV3eXV4dnR2MGpramh1aW9xa3dqaW9pamtsaTl1eXU=</uid>\n" +
                        "                <colorTriggers>\n" +
                        "                    <color>Y</color>\n" +
                        "                    <requestSupplyFulfillment>1000</requestSupplyFulfillment>\n" +
                        "                    <inkLevelTrigger>900</inkLevelTrigger>\n" +
                        "                </colorTriggers>\n" +
                        "                <colorTriggers>\n" +
                        "                    <color>C</color>\n" +
                        "                    <requestSupplyFulfillment>9000</requestSupplyFulfillment>\n" +
                        "                    <inkLevelTrigger>800</inkLevelTrigger>\n" +
                        "                </colorTriggers>\n" +
                        "                <colorTriggers>\n" +
                        "                    <color>M</color>\n" +
                        "                    <requestSupplyFulfillment>9000</requestSupplyFulfillment>\n" +
                        "                    <inkLevelTrigger>800</inkLevelTrigger>\n" +
                        "                </colorTriggers>\n" +
                        "                <state>noPlanToTrigger</state>\n" +
                        "            </supplyReplacement>\n" +
                        "        </credentialMessage>\n" +
                        "    </credentialEnvelop>\n" +
                        "</credentials>}")) // Empty JSON body
                .build();
        System.setProperty("http.proxyPort", "80");
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}
