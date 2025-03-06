package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mylossinfo", url = "${api.url.mylossinfo}")
public interface LossInformationService {
    @GetMapping(path = "/lossInformations")
    public List<LossInformation> getLossInformation();

    @GetMapping(path = "/lossInformations/{id}")
    public LossInformation getLossInformation(@PathVariable("id") Long id);

    @GetMapping(path = "/lossInformations")
    public List<LossInformation> getLossInformation();

    @GetMapping(path = "/lossInformations/{id}")
    public LossInformation getLossInformation(@PathVariable("id") Long id);
}
