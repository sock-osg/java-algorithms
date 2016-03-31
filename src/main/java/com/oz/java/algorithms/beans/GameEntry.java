/*
 * GameEntry.java
 */
package com.oz.java.algorithms.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * <p><b>Created:</b> 30/03/2016, 1:16:06</p>
 * @author <a href="mailto:samuel.quintana@globant.com">samuel</a>
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class GameEntry {

    private String name;
    private int score;

}
