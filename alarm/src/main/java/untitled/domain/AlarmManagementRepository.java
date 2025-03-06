package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "alarmManagements",
    path = "alarmManagements"
)
public interface AlarmManagementRepository
    extends PagingAndSortingRepository<AlarmManagement, Long> {}
