package com.banmenit.asm.example;

import org.objectweb.asm.*;

/**
 * @author yangyi
 * @version v 1.0
 * @date 2023/11/18 19:20
 */
public class HelloWorldDump implements Opcodes {
    public static byte[] dump() throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;
        cw.visit(V11,ACC_PUBLIC | ACC_SUPER,"sample/HelloWorld",null,"java/lang/Object",null);
        cw.visitSource("HelloWorld.java",null);
        {
            fv = cw.visitField(ACC_PRIVATE,"name","Ljava/lang/String;",null,null);
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC,"<init>","(Ljava/lang/String;)V",null,null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(7,l0);
            mv.visitVarInsn(ALOAD,0);
            mv.visitMethodInsn(INVOKESPECIAL,"java/lang/Object","<init>","()V",false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(8,l1);
            mv.visitVarInsn(ALOAD,0);
            mv.visitVarInsn(ALOAD,1);
            mv.visitFieldInsn(PUTFIELD,"sample/HelloWorld","name","Ljava/lang/String;");
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(9,l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("this","Lsample/HelloWorld;",null,l0,l3,0);
            mv.visitLocalVariable("name","Ljava/lang/String;",null,l0,l3,1);
            mv.visitMaxs(2,2);
            mv.visitEnd();
        }
        {
            MethodVisitor mv2 = cw.visitMethod(ACC_PUBLIC,"toString","()Ljava/lang/String;",null,null);
            mv2.visitCode();
            mv2.visitLdcInsn("Hello World! ");
            mv2.visitInsn(ARETURN);
            mv2.visitMaxs(1,1);
            mv2.visitEnd();
        }
        cw.visitEnd();
        return cw.toByteArray();
    }

}
