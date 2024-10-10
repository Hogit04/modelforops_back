package modelforops.domain;

import modelforops.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "feeds", path = "feeds")
public interface FeedRepository
    extends PagingAndSortingRepository<Feed, Long> {}
