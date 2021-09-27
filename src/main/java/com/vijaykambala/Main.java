package com.vijaykambala;

import com.vijaykambala.cache.Cache;
import com.vijaykambala.cache.factories.CacheFactory;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Cache cache = CacheFactory.defaultCache(5);

        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.put(4, "c");
        cache.put(5, "e");
        cache.put(6, "f");

    }
}
