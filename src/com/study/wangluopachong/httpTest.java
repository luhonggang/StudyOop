/*package com.study.wangluopachong;

public class httpTest {
    public static void main(String[] args) throws IOException {
        HttpClient client = new DefaultHttpClient();   //��ʼ��httpclient
        String personalUrl="http://www.autohome.com.cn/beijing/";     //ָ��һ������url
        HttpGet postMethod = new HttpGet(personalUrl);   //post��������
        System.out.println("postMethod====="+ postMethod+"=====");
        HttpGet getMethod = new HttpGet(personalUrl);       //  get��������
        System.out.println("Method======"+getMethod+"=====");
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");                        //��ʼ��response        
        response = client.execute(getMethod);                   //ִ����Ӧ
        System.out.println("response========"+response+"=====");
        int StatusCode = response.getStatusLine().getStatusCode(); //��ȡ��Ӧ״̬��
        System.out.println("StatusCode===="+StatusCode+"=====");
        System.out.println(response);
        if(StatusCode == 200){                          //״̬��200��ʾ��Ӧ�ɹ�
            //��ȡʵ������
            String entity = EntityUtils.toString (response.getEntity(),"utf-8");
            //���ʵ������
            System.out.println(entity);
            EntityUtils.consume(response.getEntity());       //����ʵ��
        }else {
            //�ر�HttpEntity����ʵ��
            EntityUtils.consume(response.getEntity());        //����ʵ��
        }
    }

}*/