package org.ascension.swe.acmdata.excelimportservice.service;

import org.ascension.swe.acmdata.excelimportservice.domain.Contact;
import org.ascension.swe.acmdata.excelimportservice.domain.Contact1;
import org.ascension.swe.acmdata.excelimportservice.model.SalesforceTokenResponse;
import org.ascension.swe.acmdata.excelimportservice.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Value("${salesForceUrl}")
    private String salesforceUrl;

    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }

    public Iterable<Contact> getAll(){
        return contactRepository.findAll();
    }


    public List<Contact> getContactData (){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + getAuthToken());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        //String url = "";
        ResponseEntity<Contact[]> responseEntity = restTemplate.exchange(salesforceUrl, HttpMethod.GET, httpEntity, Contact[].class);
        List<Contact> contacts = Arrays.asList(responseEntity.getBody());
        if (responseEntity.getStatusCodeValue() == 200){
            //System.out.println(accountData.toString());
          //  contactRepository.save(contact);
        }
        return contacts;
    }

    public  String saveContactData (Contact1 contact){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + getAuthToken());
        HttpEntity httpEntity = new HttpEntity(contact, httpHeaders);
        //httpEntity.
        RestTemplate restTemplate = new RestTemplate();
        String url = "";
        ResponseEntity<String> responseEntity = restTemplate.exchange(salesforceUrl, HttpMethod.POST, httpEntity, String.class);
      //  Contact contact = responseEntity.getBody();
        if (responseEntity.getStatusCodeValue() == 200){
            //System.out.println(accountData.toString());
           // contactRepository.save(contact);
        }
        return responseEntity.getBody();
    }

    private String getAuthToken() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("username", "Russell.smith1@ascension-external.org ");
        map.add("password", "P@ssw0rd01!");
        map.add("grant_type", "password");
        map.add("client_id", "3MVG9U_dUptXGpYJ0cetEMPOqkeNF3ifG040AN3ObZ6uFRjWJ0iMpajQNMNZKy7OyQgSIm9nuDCaGyKcoXmeV");
        map.add("client_secret", "848294A6FC5E3FE215A36F09CF68E523F99E5A133D373C644FF450A7A014B2F2");
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<MultiValueMap<String, String>>(map, httpHeaders);
        ResponseEntity<SalesforceTokenResponse> responseEntity = restTemplate.exchange("https://test.salesforce.com/services/oauth2/token", HttpMethod.POST, httpEntity, SalesforceTokenResponse.class);
        String token = null;
        if (responseEntity.getStatusCodeValue() == 200) {
            SalesforceTokenResponse salesforceTokenResponse = responseEntity.getBody();
            token = salesforceTokenResponse.getAccess_token();
        }
        return token;
    }
}
