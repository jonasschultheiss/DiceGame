package sample.Model;

import java.util.ArrayList;

public class Move
{
    public ArrayList<Dice> dices;

    public Move()
    {
        this.dices = new ArrayList<Dice>();
    }

    public Move(ArrayList<Dice> _dices)
    {
        this.dices = _dices;
    }

    public void AddDice(Dice _dice)
    {
        this.dices.add(_dice);
    }
}
