package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @Author MututwaM
 */
@Controller
@Configuration
@EnableScheduling
public class EmailDataController {


    /**
     * Crone Job: Get all disbursed data
     * @throws IOException
     */
    //@Scheduled(cron = "05 00 * * * ?")
    //@Scheduled(cron = "1/5 * * * * ?") // run cron at minute 5 past every hour from 1 through 23.
    @Async
    //@Scheduled(cron = "0 1/15 * * * ?")  // run cron at minute 0 past every 15th hour from 1 through 23.
    @Scheduled(cron = "0 0 */8 ? * *")  // run cron every 8 hours.
    //@RequestMapping(value = "/testTmuDeclarationsTab")
    void runTMULiabilityUpdate() throws IOException, InterruptedException {
        /*runClearingJob();
        runDeclarationsJob();*/
    }

    
    //End of class
}
