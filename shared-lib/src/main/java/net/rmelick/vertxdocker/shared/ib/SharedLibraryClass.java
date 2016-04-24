package net.rmelick.vertxdocker.shared.ib;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 *
 */
public class SharedLibraryClass {
  public static String RMELICK_TEST_SHARED_STRING = "rmelick_test_shared_string";

  public static boolean testSharedMethod() {
    return true;
  }

  public static boolean testTransitiveDependency() {
    Multiset<String> multiSet = HashMultiset.create();
    multiSet.add("testString");
    return multiSet.contains("testString");
  }
}
