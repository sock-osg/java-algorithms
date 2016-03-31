/*
 * Scoreboard.java
 */
package com.oz.java.algorithms.beans;

import lombok.Data;

/**
 * 
 * <p><b>Created:</b> 30/03/2016, 1:31:33</p>
 * @author <a href="mailto:samuel.quintana@globant.com">samuel</a>
 * @since 1.0
 */
@Data
public class Scoreboard {

    private int numEntries = 0;
    private GameEntry[] board;

    /**
     * Constructs an empty scoreboard with the given capacity for storing entries.
     * @param capacity
     */
    public Scoreboard(int capacity) {
        super();
        this.board = new GameEntry[capacity];
    }

    /**
     * Attempt to add a new score to the collection (if it is high enough)
     * @param entry
     */
    public void add(GameEntry entry) {
        int newScore = entry.getScore();

        // is the new entry e really a high score?
        if (this.numEntries < this.board.length || newScore > this.board[this.numEntries - 1].getScore()) {
            if (this.numEntries < this.board.length) {
                this.numEntries++;
            }
            int j = numEntries - 1;
            while(j > 0 && this.board[j - 1].getScore() < newScore) {
                this.board[j] = this.board[j - 1];
                j--;
            }
            this.board[j] = entry;
        }
    }
    
}
