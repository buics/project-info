package project_traker.project_traker;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projectinfo", path = "projectinfo")
public interface ProjectInfoRepository extends MongoRepository<ProjectInfo, String> {

}
