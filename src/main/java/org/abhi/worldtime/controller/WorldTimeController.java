package org.abhi.worldtime.controller;

import org.abhi.worldtime.service.WorldTimeService;
import org.abhi.worldtime.model.TimeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WorldTimeController {

    @Autowired
    private WorldTimeService worldTimeService;

    @GetMapping("/time")
    public List<TimeResponse> getTime(@RequestParam Map<String, String> parameters){
        return worldTimeService.getTime(parameters);
    }
}
