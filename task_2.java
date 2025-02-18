@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}
@Test
public void checkIsAdultWhenAgeIsLessThan18False(){
       Program program = new Program();
    boolean isAdult = program.checkIsAdult(16);
    assertEquals("Должно вернуться true, так как пользователю меньше 18 лет", false, isAdult); 
}

@Test
public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}
