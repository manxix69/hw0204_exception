public class Main {
    public static void main(String[] args)  {

        try {
            checkUserData("SDFsd_f5642fdf", "dfsS8Dfdf968", "dfsS8Dfdf968");
        } catch (WrongLoginException e) {
            System.out.println("Введен недопустимый логин!");
        } catch (WrongPasswordException e) {
            System.out.println("Введен недопустимый пароль!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так. Попробуйте позднее.");
        } finally {
            System.out.println("Работа метода checkUserData завершена.");
        }
    }


    public static void checkUserData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!(login.length() <= 20)
                || !login.matches("[_A-z0-9]+")) {
            throw new WrongLoginException();
        }
        if (!(password.length() <= 20)
                || !password.matches("[_A-z0-9]+")
                || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

}
