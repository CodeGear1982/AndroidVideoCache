package com.danikula.videocache.headers;

import java.util.Map;

/**
 * Created with IntelliJ
 * Created by lucas
 * Date 26/03/15
 */

public interface HeaderInjector {

    Map<String, String> loadFromUrl(String url);

}
