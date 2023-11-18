package lsieun.code.opcode;

import lsieun.cst.OpcodeConst;
import lsieun.code.Instruction;
import lsieun.code.visitors.OpcodeVisitor;
import lsieun.code.facet.StackConsumer;

public class MONITOREXIT extends Instruction implements StackConsumer {

    public MONITOREXIT() {
        super(OpcodeConst.MONITOREXIT, 1);
    }

    @Override
    public void accept(final OpcodeVisitor v) {
        v.visitMONITOREXIT(this);
    }

}
