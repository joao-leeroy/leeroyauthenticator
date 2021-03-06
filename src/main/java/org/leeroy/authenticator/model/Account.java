package org.leeroy.authenticator.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;

@MongoEntity
@Data
public class Account extends PanacheMongoEntity {

    private String username;
    private String password;
}
