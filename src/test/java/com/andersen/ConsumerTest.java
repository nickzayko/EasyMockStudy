package com.andersen;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.*;
import static org.easymock.EasyMock.replay;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConsumerTest {

    @Rule
    public EasyMockRule easyMockRule = new EasyMockRule(this);

    @TestSubject
    Consumer consumer = new Consumer();

    @Mock
    ServiceInterface serviceInterface;

    @Test
    public void testOpinion(){
        expect(serviceInterface.doSomething()).andStubReturn("great");
        replay(serviceInterface);

        assertThat(consumer.opinion(), is("Service was: great"));
    }

}