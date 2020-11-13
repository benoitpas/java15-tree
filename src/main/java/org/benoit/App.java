package org.benoit;

public class App
{
    public static void main( String[] args )
    {
        var l = new Tree.Leaf();
        var nd = new Tree.Branch("d", l, l);
        var nb = new Tree.Branch("b", nd, l);
        var ne = new Tree.Branch("e", l, l);
        var nc = new Tree.Branch("c", l, ne);
        var na = new Tree.Branch("a", nb, nc);

        System.out.println(na);
        Tree t = new Tree();
        System.out.println(t.addId(na));

    }
}
