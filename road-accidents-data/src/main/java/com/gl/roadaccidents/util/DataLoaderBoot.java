package com.gl.roadaccidents.util;

import com.gl.roadaccidents.config.DataLoadConfiguration;
import com.gl.roadaccidents.util.loader.RoadAccidentDataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gavin on 16-5-15.
 */
public class DataLoaderBoot {
    private static final Logger log = LoggerFactory.getLogger(DataLoaderBoot.class);

    public static final String KEY_CLEAR_DATA="clearData";
    public static final String KEY_MID_STOP = "midStop";

    public static final String CLEAR_DATA="true";
    public static final String MID_STOP = "true";


    public static void main(String... args) {
        log.info("START");
        System.setProperty(KEY_CLEAR_DATA, CLEAR_DATA);
        System.setProperty(KEY_MID_STOP, MID_STOP);
        try {
            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DataLoadConfiguration.class);
            RoadAccidentDataLoader loader = ctx.getBean(RoadAccidentDataLoader.class);

            loader.load();

        } catch (Throwable e) {
            log.error("ERROR when loading data.", e);
        }

        log.info("END");
    }
}
