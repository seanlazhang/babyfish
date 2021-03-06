/*
 * BabyFish, Object Model Framework for Java and JPA.
 * https://github.com/babyfish-ct/babyfish
 *
 * Copyright (c) 2008-2016, Tao Chen
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * Please visit "http://opensource.org/licenses/LGPL-3.0" to know more.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 */
package org.babyfishdemo.foundation.equality.interfaze;

import org.babyfish.lang.OverrideEquality;

/**
 * @author Tao Chen
 */
public interface Point3D extends Point2D {

    int getZ();
    
    void setZ(int z);
    
    @Override
    int hashCode();
    
    /*
     * The "@OverrideEquality" means this "equals" method 
     * overrides the real rule of equality.
     */
    @OverrideEquality
    @Override
    boolean equals(Object obj);
}
