package com.eemihauk.materialtemplate;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.closeDrawer;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.DrawerMatchers.isOpen;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class NavDrawerTest extends ActivityInstrumentationTestCase2 {

    public NavDrawerTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testNavDrawerStartsClosed() {
        onView(isRoot()).check(matches(isClosed()));
    }

    public void testNavDrawerOpens() {
        openDrawer(R.id.drawer_layout);
        onView(isRoot()).check(matches(isOpen()));
    }

    public void testNavDrawerOpenAndClose() {
        openDrawer(R.id.drawer_layout);
        closeDrawer(R.id.drawer_layout);
        onView(withId(R.id.navigation_drawer)).check(matches(isClosed()));
    }

}