package lsieun.code.opcode;

import lsieun.cst.OpcodeConst;
import lsieun.code.Instruction;
import lsieun.code.visitors.OpcodeVisitor;
import lsieun.code.facet.LoadInstruction;

public final class DLOAD_0 extends Instruction implements LoadInstruction {

    public final int index = 0;

    public DLOAD_0() {
        super(OpcodeConst.DLOAD_0, 1);
    }

    @Override
    public void accept(OpcodeVisitor v) {
        v.visitDLOAD_0(this);
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void setIndex(int index) {
        throw new RuntimeException("index is final");
    }
}
