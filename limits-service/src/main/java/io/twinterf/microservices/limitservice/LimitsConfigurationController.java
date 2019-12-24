package io.twinterf.microservices.limitservice;

import io.twinterf.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
