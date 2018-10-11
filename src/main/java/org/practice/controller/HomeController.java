package org.practice.controller;

import org.practice.model.Profile;
import org.practice.service.rest.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by estifen on 10/11/2018.
 */
@Controller
@RequestMapping({"/", "/home"})
public class HomeController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model){
        List<Profile> profileList = profileService.getAllProfiles();
        model.addAttribute("profileList", profileList);
        return "home";
    }
}
