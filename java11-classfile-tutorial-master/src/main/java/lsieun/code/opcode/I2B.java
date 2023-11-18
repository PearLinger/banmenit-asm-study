package lsieun.code.opcode;

import lsieun.cst.OpcodeConst;
import lsieun.code.Instruction;
import lsieun.code.visitors.OpcodeVisitor;
import lsieun.code.facet.ConversionInstruction;

public class I2B extends Instruction implements ConversionInstruction {

    public I2B() {
        super(OpcodeConst.I2B, 1);
    }

    @Override
    public void accept(final OpcodeVisitor v) {
        v.visitI2B(this);
    }

}
