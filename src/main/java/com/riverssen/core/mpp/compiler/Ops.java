package com.riverssen.core.mpp.compiler;

/** Object oriented opcodes inspired by the java vm's own opcodes with a little twist. **/
public enum Ops
{
    //load a reference onto the stack from a local variable #index
    aload(0, "load a reference onto the stack from a local variable"),
    aload_0(1, "load a reference onto the stack from a local variable 0"),
    aload_1(2, "load a reference onto the stack from a local variable 1"),
    aload_2(3, "load a reference onto the stack from a local variable 2"),
    aload_3(4, "load a reference onto the stack from a local variable 3"),
//    aaload(29, "load a reference onto the stack from a local object"),
    //load null reference to stack
    aconst_null(5, "push a null reference onto the stack"),
    aconst_new("push a new object onto the stack"),

    //store a reference into local variable #index
    astore(6, "store a reference into a local variable"),
    astore_0(7, "store a reference into a local variable 0"),
    astore_1(8, "store a reference into a local variable 1"),
    astore_2(9, "store a reference into a local variable 2"),
    astore_3(10, "store a reference into a local variable 3"),
    astore_null(11, "store a null reference into a local variable"),

    bregld(12,   "load a byte onto the register from a local variable"),
    bregld_0(13, "load a byte onto the register from a local variable 0"),
    bregld_1(14, "load a byte onto the register from a local variable 1"),
    bregld_2(15, "load a byte onto the register from a local variable 2"),
    bregld_3(16, "load a byte onto the register from a local variable 3"),

    bregld_u(12,   "load an unsigned byte onto the register from a local variable"),
    bregld_0_u(13, "load an unsigned byte onto the register from a local variable 0"),
    bregld_1_u(14, "load an unsigned byte onto the register from a local variable 1"),
    bregld_2_u(15, "load an unsigned byte onto the register from a local variable 2"),
    bregld_3_u(16, "load an unsigned byte onto the register from a local variable 3"),

    sregld(12,   "load a short onto the register from a local variable"),
    sregld_0(13, "load a short onto the register from a local variable 0"),
    sregld_1(14, "load a short onto the register from a local variable 1"),
    sregld_2(15, "load a short onto the register from a local variable 2"),
    sregld_3(16, "load a short onto the register from a local variable 3"),

    sregld_u(12,   "load an unsigned short onto the register from a local variable"),
    sregld_0_u(13, "load an unsigned short onto the register from a local variable 0"),
    sregld_1_u(14, "load an unsigned short onto the register from a local variable 1"),
    sregld_2_u(15, "load an unsigned short onto the register from a local variable 2"),
    sregld_3_u(16, "load an unsigned short onto the register from a local variable 3"),

    //load an integer onto the register from a local variable #index #size_in_bytes #cast_type
    iregld(12, "load an integer onto the register from a local variable"),
    iregld_0(13, "load an integer onto the register from a local variable 0"),
    iregld_1(14, "load an integer onto the register from a local variable 1"),
    iregld_2(15, "load an integer onto the register from a local variable 2"),
    iregld_3(16, "load an integer onto the register from a local variable 3"),
    iregld_u(12, "load an integer onto the register from a local variable"),
    iregld_0_u(13, "load an unsigned integer onto the register from a local variable 0"),
    iregld_1_u(14, "load an unsigned integer onto the register from a local variable 1"),
    iregld_2_u(15, "load an unsigned integer onto the register from a local variable 2"),
    iregld_3_u(16, "load an unsigned integer onto the register from a local variable 3"),

    lregld(12,   "load a long onto the register from a local variable"),
    lregld_0(13, "load a long onto the register from a local variable 0"),
    lregld_1(14, "load a long onto the register from a local variable 1"),
    lregld_2(15, "load a long onto the register from a local variable 2"),
    lregld_3(16, "load a long onto the register from a local variable 3"),
    lregld_u(12, "load a long onto the register from a local variable"),
    lregld_0_u(13, "load an unsigned long onto the register from a local variable 0"),
    lregld_1_u(14, "load an unsigned long onto the register from a local variable 1"),
    lregld_2_u(15, "load an unsigned long onto the register from a local variable 2"),
    lregld_3_u(16, "load an unsigned long onto the register from a local variable 3"),

    liregld(12,   "load a 128bit integer onto the register from a local variable"),
    liregld_0(13, "load a 128bit integer onto the register from a local variable 0"),
    liregld_1(14, "load a 128bit integer onto the register from a local variable 1"),
    liregld_2(15, "load a 128bit integer onto the register from a local variable 2"),
    liregld_3(16, "load a 128bit integer onto the register from a local variable 3"),
    liregld_u(12, "load a 128bit integer onto the register from a local variable"),
    liregld_0_u(13, "load an unsigned 128bit integer onto the register from a local variable 0"),
    liregld_1_u(14, "load an unsigned 128bit integer onto the register from a local variable 1"),
    liregld_2_u(15, "load an unsigned 128bit integer onto the register from a local variable 2"),
    liregld_3_u(16, "load an unsigned 128bit integer onto the register from a local variable 3"),

    llregld(12,   "load a 256bit integer onto the register from a local variable"),
    llregld_0(13, "load a 256bit integer onto the register from a local variable 0"),
    llregld_1(14, "load a 256bit integer onto the register from a local variable 1"),
    llregld_2(15, "load a 256bit integer onto the register from a local variable 2"),
    llregld_3(16, "load a 256bit integer onto the register from a local variable 3"),
    llregld_u(12, "load a 256bit integer onto the register from a local variable"),
    llregld_0_u(13, "load an unsigned 256bit integer onto the register from a local variable 0"),
    llregld_1_u(14, "load an unsigned 256bit integer onto the register from a local variable 1"),
    llregld_2_u(15, "load an unsigned 256bit integer onto the register from a local variable 2"),
    llregld_3_u(16, "load an unsigned 256bit integer onto the register from a local variable 3"),


    //load a float onto the register from a local variable #index #size_in_bytes #cast_type
    fregld(17, "load a float onto the register from a local variable"),
    fregld_0(18, "load a float onto the register from a local variable 0"),
    fregld_1(19, "load a float onto the register from a local variable 1"),
    fregld_2(20, "load a float onto the register from a local variable 2"),
    fregld_3(21, "load a float onto the register from a local variable 3"),

    dregld(17, "load a double onto the register from a local variable"),
    dregld_0(18, "load a double onto the register from a local variable 0"),
    dregld_1(19, "load a double onto the register from a local variable 1"),
    dregld_2(20, "load a double onto the register from a local variable 2"),
    dregld_3(21, "load a double onto the register from a local variable 3"),

    dfregld(17, "load a 128bit float onto the register from a local variable"),
    dfregld_0(18, "load a 128bit float onto the register from a local variable 0"),
    dfregld_1(19, "load a 128bit float onto the register from a local variable 1"),
    dfregld_2(20, "load a 128bit float onto the register from a local variable 2"),
    dfregld_3(21, "load a 128bit float onto the register from a local variable 3"),

    ddregld(17, "load a 256bit float onto the register from a local variable"),
    ddregld_0(18, "load a 256bit float onto the register from a local variable 0"),
    ddregld_1(19, "load a 256bit float onto the register from a local variable 1"),
    ddregld_2(20, "load a 256bit float onto the register from a local variable 2"),
    ddregld_3(21, "load a 256bit float onto the register from a local variable 3"),

    //load an integer onto the register from data #size_in_bytes #data_bytes* #cast_type
    iregst(22, "load an integer onto the register from data"),
    fregst(23, "load a float onto the register from data"),

    mul(24, "perform a multiplication on the register"),
    mul_0(24, "perform a multiplication on the register and store value in local variable 0"),
    mul_1(24, "perform a multiplication on the register and store value in local variable 1"),
    mul_2(24, "perform a multiplication on the register and store value in local variable 2"),
    mul_3(24, "perform a multiplication on the register and store value in local variable 3"),
    div(25, "perform a division on the register and store value in local variable 0"),
    div_0(25, "perform a division on the register and store value in local variable 0"),
    div_1(25, "perform a division on the register and store value in local variable 1"),
    div_2(25, "perform a division on the register and store value in local variable 2"),
    div_3(25, "perform a division on the register and store value in local variable 3"),
    sub(26, "perform a subtraction on the register"),
    sub_0(26, "perform a subtraction on the register and store value in local variable 0"),
    sub_1(26, "perform a subtraction on the register and store value in local variable 1"),
    sub_2(26, "perform a subtraction on the register and store value in local variable 2"),
    sub_3(26, "perform a subtraction on the register and store value in local variable 3"),
    add(27, "perform a addition on the register"),
    add_0(27, "perform a addition on the register and store value in local variable 0"),
    add_1(27, "perform a addition on the register and store value in local variable 1"),
    add_2(27, "perform a addition on the register and store value in local variable 2"),
    add_3(27, "perform a addition on the register and store value in local variable 3"),
    mod(28, "perform a modulo on the register"),
    mod_0(28, "perform a modulo on the register and store value in local variable 0"),
    mod_1(28, "perform a modulo on the register and store value in local variable 1"),
    mod_2(28, "perform a modulo on the register and store value in local variable 2"),
    mod_3(28, "perform a modulo on the register and store value in local variable 3"),
//    aastore(30, "store a reference into a local object"),
    iiregld(31, "load an integer onto the register from a local object"),
    ffregld(32, "load a float onto the register from a local object"),

    areturn(33, "return a reference from a method"),
    breturn(34, "return a byte from a method"),
    sreturn(34, "return a short from a method"),
    ireturn(34, "return an integer from a method"),
    lreturn(34, "return a long from a method"),
    lireturn(34, "return a 128bit integer from a method"),
    llreturn(34, "return a 256bit integer from a method"),
    freturn(35, "return a float from a method"),
    dreturn(35, "return a double from a method"),
    dfreturn(35, "return a 128bit float from a method"),
    ddreturn(35, "return a 256bit float from a method"),
    returnvoid("return void"),
    returnnull("return null"),

    invoke(36, "invoke a method"),
    invked(36, "invoke a dynamic method"),
    invokentv(37, "invoke a native method"),

    bconst(38,   "push a byte onto the stack"),
    bconst_0(39, "push a byte onto the stack with value 0"),
    bconst_1(40, "push a byte onto the stack with value 1"),
    bconst_2(41, "push a byte onto the stack with value 2"),
    bconst_3(42, "push a byte onto the stack with value 3"),
    bconst_4(43, "push a byte onto the stack with value 4"),
    bconst_5(44, "push a byte onto the stack with value 5"),
    bconst_e(44, "push a byte onto the stack with no value"),
    bconstrld("load a byte onto the register from input"),
    bconstrld_u("load an unsigned byte onto the register from input"),
    bload(0,   "load a byte onto the stack from a local variable"),
    bload_0(1, "load a byte onto the stack from a local variable 0"),
    bload_1(2, "load a byte onto the stack from a local variable 1"),
    bload_2(3, "load a byte onto the stack from a local variable 2"),
    bload_3(4, "load a byte onto the stack from a local variable 3"),

    sconst(38,   "push a short onto the stack"),
    sconst_0(39, "push a short onto the stack with value 0"),
    sconst_1(40, "push a short onto the stack with value 1"),
    sconst_2(41, "push a short onto the stack with value 2"),
    sconst_3(42, "push a short onto the stack with value 3"),
    sconst_4(43, "push a short onto the stack with value 4"),
    sconst_5(44, "push a short onto the stack with value 5"),
    sconst_e(44, "push a short onto the stack with no value"),
    sconstrld("load a short onto the register from input"),
    sconstrld_u("load an unsigned short onto the register from input"),
    sload(0,   "load a short onto the stack from a local variable"),
    sload_0(1, "load a short onto the stack from a local variable 0"),
    sload_1(2, "load a short onto the stack from a local variable 1"),
    sload_2(3, "load a short onto the stack from a local variable 2"),
    sload_3(4, "load a short onto the stack from a local variable 3"),

    iconst(38, "push an integer onto the stack"),
    iconst_0(39, "push an integer onto the stack with value 0"),
    iconst_1(40, "push an integer onto the stack with value 1"),
    iconst_2(41, "push an integer onto the stack with value 2"),
    iconst_3(42, "push an integer onto the stack with value 3"),
    iconst_4(43, "push an integer onto the stack with value 4"),
    iconst_5(44, "push an integer onto the stack with value 5"),
    iconst_e(44, "push an integer onto the stack with no value"),
    iload(0,   "load an integer onto the stack from a local variable"),
    iload_0(1, "load an integer onto the stack from a local variable 0"),
    iload_1(2, "load an integer onto the stack from a local variable 1"),
    iload_2(3, "load an integer onto the stack from a local variable 2"),
    iload_3(4, "load an integer onto the stack from a local variable 3"),
    iconstrld("load a integer onto the register from input"),
    iconstrld_u("load an unsigned integer onto the register from input"),

    lconst(38,   "push a long onto the stack"),
    lconst_0(39, "push a long onto the stack with value 0"),
    lconst_1(40, "push a long onto the stack with value 1"),
    lconst_2(41, "push a long onto the stack with value 2"),
    lconst_3(42, "push a long onto the stack with value 3"),
    lconst_4(43, "push a long onto the stack with value 4"),
    lconst_5(44, "push a long onto the stack with value 5"),
    lconst_e(44, "push a long onto the stack with no value"),
    lconstrld("load a long onto the register from input"),
    lconstrld_0("load a long onto the register from input"),
    lconstrld_1("load a long onto the register from input"),
    lconstrld_2("load a long onto the register from input"),
    lconstrld_3("load a long onto the register from input"),
    lconstrld_u("load an unsigned long onto the register from input"),
    lconstrldu_0("load an unsigned long onto the register from input"),
    lconstrldu_1("load an unsigned long onto the register from input"),
    lconstrldu_2("load an unsigned long onto the register from input"),
    lconstrldu_3("load an unsigned long onto the register from input"),
    lload(0,   "load a long onto the stack from a local variable"),
    lload_0(1, "load a long onto the stack from a local variable 0"),
    lload_1(2, "load a long onto the stack from a local variable 1"),
    lload_2(3, "load a long onto the stack from a local variable 2"),
    lload_3(4, "load a long onto the stack from a local variable 3"),

    liconst(38,   "push a 128bit integer onto the stack"),
    liconst_0(39, "push a 128bit integer onto the stack with value 0"),
    liconst_1(40, "push a 128bit integer onto the stack with value 1"),
    liconst_2(41, "push a 128bit integer onto the stack with value 2"),
    liconst_3(42, "push a 128bit integer onto the stack with value 3"),
    liconst_4(43, "push a 128bit integer onto the stack with value 4"),
    liconst_5(44, "push a 128bit integer onto the stack with value 5"),
    liconst_e(44, "push a 128bit integer onto the stack with no value"),
    liconstrld("load a 128bit integer onto the register from input"),
    liconstrld_u("load an unsigned 128bit integer onto the register from input"),
    liload(0,   "load a long onto the stack from a local variable"),
    liload_0(1, "load a long onto the stack from a local variable 0"),
    liload_1(2, "load a long onto the stack from a local variable 1"),
    liload_2(3, "load a long onto the stack from a local variable 2"),
    liload_3(4, "load a long onto the stack from a local variable 3"),

    llconst(38,   "push a 256bit integer onto the stack"),
    llconst_0(39, "push a 256bit integer onto the stack with value 0"),
    llconst_1(40, "push a 256bit integer onto the stack with value 1"),
    llconst_2(41, "push a 256bit integer onto the stack with value 2"),
    llconst_3(42, "push a 256bit integer onto the stack with value 3"),
    llconst_4(43, "push a 256bit integer onto the stack with value 4"),
    llconst_5(44, "push a 256bit integer onto the stack with value 5"),
    llconst_e(44, "push a 256bit integer onto the stack with no value"),
    llconstrld("load a 256bit integer onto the register from input"),
    llconstrld_u("load an unsigned 256bit integer onto the register from input"),
    llload(0,   "load a long onto the stack from a local variable"),
    llload_0(1, "load a long onto the stack from a local variable 0"),
    llload_1(2, "load a long onto the stack from a local variable 1"),
    llload_2(3, "load a long onto the stack from a local variable 2"),
    llload_3(4, "load a long onto the stack from a local variable 3"),

    fconst(45, "push a float onto the stack"),
    fconst_0(46, "push a float onto the stack with value 0"),
    fconst_1(47, "push a float onto the stack with value 1"),
    fconst_2(48, "push a float onto the stack with value 2"),
    fconst_3(49, "push a float onto the stack with value 3"),
    fconst_4(50, "push a float onto the stack with value 4"),
    fconst_5(51, "push a float onto the stack with value 5"),
    fconst_e(52, "push a float onto the stack with no value"),
    fload(0,   "load a float onto the stack from a local variable"),
    fload_0(1, "load a float onto the stack from a local variable 0"),
    fload_1(2, "load a float onto the stack from a local variable 1"),
    fload_2(3, "load a float onto the stack from a local variable 2"),
    fload_3(4, "load a float onto the stack from a local variable 3"),
    fconstrld("load a long onto the register from input"),
    fconstrld_u("load an unsigned long onto the register from input"),

    dconst(45,   "push a double onto the stack"),
    dconst_0(46, "push a double onto the stack with value 0"),
    dconst_1(47, "push a double onto the stack with value 1"),
    dconst_2(48, "push a double onto the stack with value 2"),
    dconst_3(49, "push a double onto the stack with value 3"),
    dconst_4(50, "push a double onto the stack with value 4"),
    dconst_5(51, "push a double onto the stack with value 5"),
    dconst_e(52, "push a double onto the stack with no value"),
    dconstrld("load a long onto the register from input"),
    dconstrld_u("load an unsigned long onto the register from input"),
    dload(0,   "load a long onto the stack from a local variable"),
    dload_0(1, "load a long onto the stack from a local variable 0"),
    dload_1(2, "load a long onto the stack from a local variable 1"),
    dload_2(3, "load a long onto the stack from a local variable 2"),
    dload_3(4, "load a long onto the stack from a local variable 3"),

    dfconst(45,   "push a 128bit double onto the stack"),
    dfconst_0(46, "push a 128bit double onto the stack with value 0"),
    dfconst_1(47, "push a 128bit double onto the stack with value 1"),
    dfconst_2(48, "push a 128bit double onto the stack with value 2"),
    dfconst_3(49, "push a 128bit double onto the stack with value 3"),
    dfconst_4(50, "push a 128bit double onto the stack with value 4"),
    dfconst_5(51, "push a 128bit double onto the stack with value 5"),
    dfconst_e(52, "push a 128bit double onto the stack with no value"),
    dfconstrld("load a long onto the register from input"),
    dfconstrld_u("load an unsigned long onto the register from input"),
    dfload(0,   "load a long onto the stack from a local variable"),
    dfload_0(1, "load a long onto the stack from a local variable 0"),
    dfload_1(2, "load a long onto the stack from a local variable 1"),
    dfload_2(3, "load a long onto the stack from a local variable 2"),
    dfload_3(4, "load a long onto the stack from a local variable 3"),

    ddconst(45,   "push a 256bit double onto the stack"),
    ddconst_0(46, "push a 256bit double onto the stack with value 0"),
    ddconst_1(47, "push a 256bit double onto the stack with value 1"),
    ddconst_2(48, "push a 256bit double onto the stack with value 2"),
    ddconst_3(49, "push a 256bit double onto the stack with value 3"),
    ddconst_4(50, "push a 256bit double onto the stack with value 4"),
    ddconst_5(51, "push a 256bit double onto the stack with value 5"),
    ddconst_e(52, "push a 256bit double onto the stack with no value"),
    ddconstrld("load a long onto the register from input"),
    ddconstrld_u("load an unsigned long onto the register from input"),
    ddload(0,   "load a long onto the stack from a local variable"),
    ddload_0(1, "load a long onto the stack from a local variable 0"),
    ddload_1(2, "load a long onto the stack from a local variable 1"),
    ddload_2(3, "load a long onto the stack from a local variable 2"),
    ddload_3(4, "load a long onto the stack from a local variable 3"),

    csconst(45,   "push a string onto the stack"),
    csconst_e(52, "push a string onto the stack with no value"),
    csload(0,   "load a long onto the stack from a local variable"),
    csload_0(1, "load a long onto the stack from a local variable 0"),
    csload_1(2, "load a long onto the stack from a local variable 1"),
    csload_2(3, "load a long onto the stack from a local variable 2"),
    csload_3(4, "load a long onto the stack from a local variable 3"),

    ebp(53, "set 'this'"),
    pop("pop the top value from the stack"),
    pop2("pop the top two values from the stack"),

    bstore  ("store a byte value into a local variable"),
    bstore_0("store a byte value into a local variable 0"),
    bstore_1("store a byte value into a local variable 1"),
    bstore_2("store a byte value into a local variable 2"),
    bstore_3("store a byte value into a local variable 3"),

    sstore  ("store a short value into a local variable"),
    sstore_0("store a short value into a local variable 0"),
    sstore_1("store a short value into a local variable 1"),
    sstore_2("store a short value into a local variable 2"),
    sstore_3("store a short value into a local variable 3"),

    istore("store an integer value into a local variable"),
    istore_0("store an integer value into a local variable 0"),
    istore_1("store an integer value into a local variable 1"),
    istore_2("store an integer value into a local variable 2"),
    istore_3("store an integer value into a local variable 3"),

    iconsts("store an integer value into a local variable from data"),
    iconsts_0("store an integer value into a local variable 0 from data"),
    iconsts_1("store an integer value into a local variable 1 from data"),
    iconsts_2("store an integer value into a local variable 2 from data"),
    iconsts_3("store an integer value into a local variable 3 from data"),

    iconsts0_0("store an integer value into a local variable 0 with value 0"),
    iconsts0_1("store an integer value into a local variable 1 with value 0"),
    iconsts0_2("store an integer value into a local variable 2 with value 0"),
    iconsts0_3("store an integer value into a local variable 3 with value 0"),

    iconsts1_0("store an integer value into a local variable 0 with value 1"),
    iconsts1_1("store an integer value into a local variable 1 with value 1"),
    iconsts1_2("store an integer value into a local variable 2 with value 1"),
    iconsts1_3("store an integer value into a local variable 3 with value 1"),

    iconsts2_0("store an integer value into a local variable 0 with value 2"),
    iconsts2_1("store an integer value into a local variable 1 with value 2"),
    iconsts2_2("store an integer value into a local variable 2 with value 2"),
    iconsts2_3("store an integer value into a local variable 3 with value 2"),

    iconstse_0("store an integer value into a local variable 0 with no value"),
    iconstse_1("store an integer value into a local variable 1 with no value"),
    iconstse_2("store an integer value into a local variable 2 with no value"),
    iconstse_3("store an integer value into a local variable 3 with no value"),
    iconstse("store an integer value into a local variable with no value"),



    lstore  ("store a long value into a local variable"),
    lstore_0("store a long value into a local variable 0"),
    lstore_1("store a long value into a local variable 1"),
    lstore_2("store a long value into a local variable 2"),
    lstore_3("store a long value into a local variable 3"),



    listore  ("store a 128bit integer value into a local variable"),
    listore_0("store a 128bit integer value into a local variable 0"),
    listore_1("store a 128bit integer value into a local variable 1"),
    listore_2("store a 128bit integer value into a local variable 2"),
    listore_3("store a 128bit integer value into a local variable 3"),


    llstore  ("store a 256bit integer value into a local variable"),
    llstore_0("store a 256bit integer value into a local variable 0"),
    llstore_1("store a 256bit integer value into a local variable 1"),
    llstore_2("store a 256bit integer value into a local variable 2"),
    llstore_3("store a 256bit integer value into a local variable 3"),

    fstore("store a float value into a local variable"),
    fstore_0("store a float value into a local variable 0"),
    fstore_1("store a float value into a local variable 1"),
    fstore_2("store a float value into a local variable 2"),
    fstore_3("store a float value into a local variable 3"),



    dstore  ("store a double value into a local variable"),
    dstore_0("store a double value into a local variable 0"),
    dstore_1("store a double value into a local variable 1"),
    dstore_2("store a double value into a local variable 2"),
    dstore_3("store a double value into a local variable 3"),


    dfstore  ("store a 128bit float value into a local variable"),
    dfstore_0("store a 128bit float value into a local variable 0"),
    dfstore_1("store a 128bit float value into a local variable 1"),
    dfstore_2("store a 128bit float value into a local variable 2"),
    dfstore_3("store a 128bit float value into a local variable 3"),


    ddstore  ("store a 256bit flaot value into a local variable"),
    ddstore_0("store a 256bit flaot value into a local variable 0"),
    ddstore_1("store a 256bit flaot value into a local variable 1"),
    ddstore_2("store a 256bit flaot value into a local variable 2"),
    ddstore_3("store a 256bit flaot value into a local variable 3"),

//    bset("set current object"),
//    bastore("store a reference into object"),
//    bistore("store an integer into object"),
//    bfstore("store a float into object"),

    anew("create a new heap array"),
    adel("delete a heap array"),
    amov("move a reference from heap data onto stack"),
    bmov,
    smov,
    imov("move an integer from heap data onto stack"),
    lmov,
    limov,
    llmov,
    fmov("move a float from heap data onto stack"),
    dmov,
    dfmov,
    ddmov,
    csmov,

    amovrld("move a reference from heap data onto the register"),
    bmovrld("move a byte from heap data onto the register"),
    smovrld("move a short from heap data onto the register"),
    imovrld("move an integer from heap data onto the register"),
    lmovrld("move a long from heap data onto the register"),
    limovrld("move a 128bit integer from heap data onto the register"),
    llmovrld("move a 256bit integer from heap data onto the register"),
    smovrld_u("move an unsigned short from heap data onto the register"),
    bmovrld_u("move an unsigned byte from heap data onto the register"),
    imovrld_u("move an unsigned integer from heap data onto the register"),
    lmovrld_u("move an unsigned long from heap data onto the register"),
    limovrld_u("move an unsigned 128bit integer from heap data onto the register"),
    llmovrld_u("move an unsigned 256bit integer from heap data onto the register"),
    fmovrld("move a float from heap data onto the register"),
    dmovrld("move a double from heap data onto the register"),
    dfmovrld("move a 128bit float from heap data onto the register"),
    ddmovrld("move a 256bit float from heap data onto the register"),
//    csmovrld("move an integer from heap data onto the register"),
    mload_a("pop a reference from stack into a heap array"),
    mload_i("pop an integer from stack into a heap array"),
    mload_f("pop an integer from stack into a heap array"),

    mregi("load an integer onto the method argument register"),
    mregf("load a float onto the method argument register"),
    mrega("load a reference onto the method argument register"),
    mregi_0,
    mregi_1,
    mregi_2,
    mregi_3,
    mregf_0,
    mregf_1,
    mregf_2,
    mregf_3,
    mrega_0,
    mrega_1,
    mrega_2,
    mrega_3,
    ptb("store a byte into a heap variable 'this'"),
    pts("store a short into a heap variable 'this'"),
    pti("store an integer into a heap variable 'this'"),
    ptl("store a long into a heap variable 'this'"),
    ptli("store a 128bit integer into a heap variable 'this'"),
    ptll("store a 256bit integer into a heap variable 'this'"),
    ptf("store a float into a heap variable 'this'"),
    ptd("store a double into a heap variable 'this'"),
    ptdf("store a 128bit float into a heap variable 'this'"),
    ptdd("store a 256bit float into a heap variable 'this'"),
    pta("store a reference into a heap variable 'this'"),
    ptcs("store a string into a heap variable 'this'"),

    btb("store a byte into a heap variable"),
    bts("store a short into a heap variable"),
    bti("store an integer into a heap variable"),
    btl("store a long into a heap variable"),
    btli("store a 128bit integer into a heap variable"),
    btll("store a 256bit integer into a heap variable"),
    btf("store a float into a heap variable"),
    btd("store a double into a heap variable"),
    btdf("store a 128bit float into a heap variable"),
    btdd("store a 256bit float into a heap variable"),
    bta("store a reference into a heap variable"),
    btcs("store a string into a heap variable"),

    b2s("cast<short>(byte)"),
    b2i("cast<int>(byte)"),
    b2l("cast<long>(byte)"),
    b2li("cast<long int>(byte)"),
    b2ll("cast<long long>(byte)"),
    b2f("cast<float>(byte)"),
    b2d("cast<double>(byte)"),
    b2df("cast<double float>(byte)"),
    b2dd("cast<double double>(byte)"),

    s2b("cast<short>(short)"),
    s2i("cast<int>(short)"),
    s2l("cast<long>(short)"),
    s2li("cast<long int>(short)"),
    s2ll("cast<long long>(short)"),
    s2f("cast<float>(short)"),
    s2d("cast<double>(short)"),
    s2df("cast<double float>(short)"),
    s2dd("cast<float float>(short)"),

    i2b("cast<byte>(int)"),
    i2s("cast<short>(int)"),
    i2l("cast<long>(int)"),
    i2li("cast<long int>(int)"),
    i2ll("cast<long long>(int)"),
    i2f("cast<float>(int)"),
    i2d("cast<double>(int)"),
    i2df("cast<double float>(int)"),
    i2dd("cast<double double>(int)"),

    l2i ("cast<int>(long)"),
    l2b ("cast<byte>(long)"),
    l2s ("cast<short>(long)"),
    l2li("cast<long int>(long)"),
    l2ll("cast<long long>(long)"),
    l2f ("cast<float>(long)"),
    l2d ("cast<double>(long)"),
    l2df("cast<double float>(long)"),
    l2dd("cast<double double>(long)"),

    li2i,
    li2b,
    li2s,
    li2l,
    li2ll,
    li2f,
    li2d,
    li2df,
    li2dd,

    ll2i,
    ll2b,
    ll2s,
    ll2l,
    ll2li,
    ll2f,
    ll2d,
    ll2df,
    ll2dd,

    f2i,
    f2b,
    f2s,
    f2l,
    f2li,
    f2ll,
    f2d,
    f2df,
    f2dd,

    d2i,
    d2b,
    d2s,
    d2l,
    d2li,
    d2ll,
    d2f,
    d2df,
    d2dd,

    df2i,
    df2b,
    df2s,
    df2l,
    df2li,
    df2ll,
    df2f,
    df2d,
    df2dd,

    dd2i,
    dd2b,
    dd2s,
    dd2l,
    dd2li,
    dd2ll,
    dd2f,
    dd2d,
    dd2df,

    b2c,
    s2c,
    i2c,
    l2c,
    li2c,
    ll2c,
    b2cu,
    s2cu,
    i2cu,
    l2cu,
    li2cu,
    ll2cu,
    f2c,
    d2c,
    df2c,
    dd2c,

    slp("force the virtual machine to sleep"),
    halt("halt the virtual machine"),
    ;
//    sin,
//    cos,
//    tan

    private static int i;
    private String desc;
    private int    opn;

    private Ops(){this("-");}

    private Ops(String data)
    {
        this(-1, data);
//        this.opn  = instructions.i ++;
//        this.desc = data;
    }

    private Ops(int op, String data)
    {
        this.opn  = instructions.i ++;
        this.desc = data;
    }

    public String getDesc()
    {
        return desc;
    }

    public int get()
    {
        return opn;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + this.desc;
    }
}
