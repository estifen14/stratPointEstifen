package org.practice.controller;

import org.practice.model.Profile;
import org.practice.service.rest.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by estifen on 10/11/2018.
 */
@Controller
@RequestMapping("/view")
public class ProfileViewController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable String id, Model model){
        Profile profile = profileService.getProfile(id);
        model.addAttribute("profile", profile);

        return "view";
    }
}
