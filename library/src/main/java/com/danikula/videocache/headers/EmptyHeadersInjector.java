/**
 * Copyright
 */
package com.danikula.videocache.headers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ
 * Created by lucas
 * Date 26/03/15
 */
public class EmptyHeadersInjector implements HeaderInjector {

    @Override
    public Map<String, String> loadFromUrl(String url) {
        return new HashMap<>();
    }

}
