package chess.core.VerktetteListe;

import chess.core.ChessMove;

public abstract class Listelement {
    public abstract int count_nodes();
    public abstract Listelement get_next();
    public abstract Datanode insert(Dataelement in);
    public abstract Dataelement get_content();
    public abstract Dataelement get_contentById(int index);
    public abstract Listelement remove(ChessMove move);



    //public abstract Listelement remove(Dataelement search);
}
