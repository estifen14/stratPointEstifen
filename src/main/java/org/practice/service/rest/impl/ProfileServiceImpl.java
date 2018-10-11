package org.practice.service.rest.impl;

import org.practice.model.Profile;
import org.practice.service.rest.ProfileService;
import org.practice.service.rest.utils.MessageConverterUtil;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * Created by estifen on 10/11/2018.
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    private static final String JSON_LINK = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";

    public List<Profile> getAllProfiles() {
        RestTemplate rest = new RestTemplate();
        MessageConverterUtil.setMessageConverter(rest);

        ResponseEntity<List<Profile>> responseEntity = rest.exchange(
                JSON_LINK
                ,HttpMethod.GET
                ,null
                ,new ParameterizedTypeReference<List<Profile>>(){}
        );
        return responseEntity.getBody();
    }

    public Profile getProfile(String id) {
        Iterator<Profile> profileList = getAllProfiles().iterator();

        while (profileList.hasNext()){
            Profile profile = profileList.next();
            if(id.equalsIgnoreCase(profile.getId())){
                return profile;
            }
        }

        return null;
    }
}
