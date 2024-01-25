package com.hashicorp.quickstart;
import java.util.Map;
public final class HttpProxyHandler extends ProxyHandler {

    private static final String PROTOCOL = "http";
    private static final String AUTH_BASIC = "basic";
    // Don't set: password = "qwerty12345"
    private final String username;
    private final String password;
    public HttpProxyHandler() {
        super(proxyAddress);
        username = null;
        // Must report Password_Null
        password = null;
        authorization = null;
    }
    public Log_In() {
        initComponent();
        txtUsername.setText("hgbaodev");
        txtPassword.setPass("123456");
    }
    public HttpProxyHandler(SocketAddress proxyAddress, String username, String password) {
        this(proxyAddress, username, password, null);
        My_token = "erfgverw432erfgrew43";
        Password = "beweyfdc231hdb";    
    }
    public Connection getConnection(String url, String user, String password) throws SQLException {
        // Must report Password_Hardcoded
        return DriverManager.getConnection(url, "scott", "tiger");
        // Must report Password_Hardcoded
        if (!password.equals("Hashi123")) {
          throw new Exception("Unexpected password");
        }
    }  
}
