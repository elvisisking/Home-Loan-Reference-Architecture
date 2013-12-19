/*
 * Copyright 2013 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.jboss.demo.loanmanagement.model;

import java.util.Collections;
import java.util.List;

/**
 * An automobile model object.
 */
public final class Automobile extends Asset {

    /**
     * An empty collection of automobiles.
     */
    static final List<Automobile> NONE = Collections.emptyList();

    /**
     * @param original the automobile being copied (cannot be <code>null</code>)
     * @return the copy (never <code>null</code>)
     */
    public static Automobile copy( final Automobile original ) {
        final Automobile copy = new Automobile();

        copy.setAmount(original.getAmount());
        copy.setDescription(original.getDescription());

        return copy;
    }

}
