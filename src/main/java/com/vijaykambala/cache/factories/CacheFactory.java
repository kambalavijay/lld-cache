package com.vijaykambala.cache.factories;

import com.vijaykambala.cache.Cache;
import com.vijaykambala.cache.policies.LRUEvictionPolicy;
import com.vijaykambala.cache.storage.HashMapBasedStorage;

public class CacheFactory {

    public static <Key, Value> Cache defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
