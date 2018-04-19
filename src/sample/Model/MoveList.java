package sample.Model;

import java.util.ArrayList;

public class MoveList
{
    public ArrayList<Move> moveList;

    public MoveList()
    {
        this.moveList = new ArrayList<Move>();
    }

    public MoveList(ArrayList<Move> _moveList)
    {
        this.moveList = _moveList;
    }

    public int GetPoints()
    {
        int points = 0;
        for (Move move : this.moveList)
        {
            for (Dice dice : move.dices)
            {
                points += dice.eyes;
            }
        }

        return points;
    }
}
