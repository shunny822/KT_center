package untitled.infra;
import untitled.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lossReports")
@Transactional
public class LossReportController {
    @Autowired
    LossReportRepository lossReportRepository;

    @RequestMapping(value = "/lossReports/reportloss",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public LossReport reportLoss(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /lossReport/reportLoss  called #####");
            LossReport lossReport = new LossReport();
            lossReport.reportLoss();
            lossReportRepository.save(lossReport);
            return lossReport;
    }
}
//>>> Clean Arch / Inbound Adaptor
