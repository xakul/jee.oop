package observer;

public class Main {

	public static void main(String[] args) {
		/**
		 * Bilgilendirilmesi için objelerimizin instanceları alınıyor.
		 */
		/**
		 * Getting instance for notify users.
		 */
		UserMan userMan = new UserMan();
		UserWoman userWoman = new UserWoman();

		NoticeObservable noticeObservable = new NoticeObservable();
		/**
		 * Bildirim gönderilecek olan kişiler listeye ekleniyor.
		 */
		/**
		 * Adding users list for notification.
		 */
		noticeObservable.addObserver(userMan);
		noticeObservable.addObserver(userWoman);
		/**
		 * Listede bulunan bütün kişilere bildirim yollanıyor.
		 */
		/**
		 * Notification send to all users.
		 */
		noticeObservable.notifyObserver();
		/**
		 * Kadın kullıcı listeden çıkarılıyor.
		 */
		/**
		 * User removed from list.
		 */
		userWoman.removeObserver();
		/**
		 * Tekrar bütün listeye bildirim yollanıyor.
		 */
		/**
		 * Again notification send to all users.
		 */
		noticeObservable.notifyObserver();
	}

}
