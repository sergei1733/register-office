package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.rest.MarriageController;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;

public class MarriageDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerFactory.class);

    private EntityManager entityManager;

    public MarriageCertificate findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");

        return null;
    }
}
