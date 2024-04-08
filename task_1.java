
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
   boolean expected = true;
   assertEquals("Возраст меньше 18 лет", expected, isAdult);
	// Напиши код здесь
}
