package org.practice.service.rest;

import org.practice.model.Profile;

import java.util.List;

/**
 * Created by estifen on 10/11/2018.
 */
public interface ProfileService {

    /**
     * Return List of Profile fetched from GET request
     */
    List<Profile> getAllProfiles();

    /**
     * Return Profile by using of id
     *
     * @param id id of Profile
     * @return Profile fetched by id
     */
    Profile getProfile(String id);
}
