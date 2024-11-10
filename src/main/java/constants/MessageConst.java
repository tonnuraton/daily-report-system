package constants;

public enum MessageConst {
	//認証
	I_LOGINED("ログインしたよん^ ^"),
	E_LOGINDE("ログインに失敗、、、"),
	I_LOGOUT("ログアウト！またね！"),

	//DB更新
	I_REGISTERED("登録が完了したにょ"),
	I_UPDATED("更新完了だにょ"),
	I_DELETED("削除完了だにょ"),

	//バリデーション
	E_NONAME("氏名を入力してくれ！"),
	E_NOPASSWORD("パスワードを入力してくれ！"),
	E_NOEMP_CODE("社員番号を入力してください"),
	E_EMP_CODE_EXIST("入力された社員番号の情報はすでに存在しています！お前は本物か！？"),
	E_NOTITLE("タイトルを入力してくれ！"),
	E_NOCONTENT("内容が何にもないよ！何か入力して！");

	/**
     * 文字列
     */
    private final String text;

    /**
     * コンストラクタ
     */
    private MessageConst(final String text) {
        this.text = text;
    }

    /**
     * 値(文字列)取得
     */
    public String getMessage() {
        return this.text;
    }
}
