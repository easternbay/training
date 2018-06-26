# Climb over the gfw
## 1 Get shadowsocks gui
1.1 Execute following command in Terminal:
```bash
$ sudo add-apt-repository ppa:hzwhuang/ss-qt5
```
There is one package download failure. That is because it does not have Ubuntu 18.04 version.

1.2 Open Software&Updates. Settings->Other software. Select ss-qt5. Click Edit. Set Distribution to xenial (the distribution code of Ubuntu 16.04). Click OK. Manually Update. Restart Later.

![Image](images/1.png?raw=true)

![Image](images/2.png?raw=true)

1.3 Execute remaining commands in Terminal:
```bash
$ sudo apt-get update
$ sudo apt-get install shadowsocks-qt5
```
## 2 Configure shadowsocks
2.1 Open shadowsocks. Connect->Add->Manually. Create 3 connections as following:

JP

Your Server IP        :  54.250.85.13

Your Server Port      :  11295

Your Password         :  Kf9bRboFWgYZWZbCTZWLgsZb

Your Encryption Method:  aes-256-cfb


US

Your Server IP        :  34.217.75.248

Your Server Port      :  9825

Your Password         :  rXQpsJoVrTngiLFRK3ygUseo

Your Encryption Method:  aes-256-cfb


JP Vultr

Your Server IP        :  207.148.103.220

Your Server Port      :  16904

Your Password         :  Easternbayqucheng404

Your Encryption Method:  aes-256-cfb

![Image](images/3.png?raw=true)

2.2 Select any one of the connections that works. Right Click->Connect. Confirm that connect succeeds.

![Image](images/4.png?raw=true)

## 3 Install offline Chrome plugin SwitchyOmega
3.1 Download, install and open chrome. File->More Tools->Extensions. Toggle on the dev mode. Drag the SwitchyOmega plugin offline installer from u disk to Chrome window to execute offline installation. As soon as the installation is complete, a configuration page is shown.

3.2 In default mode proxy, set proxy protocol to SOCKS5, set proxy server to localhost and set 
proxy port to shadowsocks' default port 1080.

![Image](images/5.png?raw=true)

3.3 Select mode auto switch. Delete default configuration. Add rule list. Set rule list format to AutoProxy. Set rule list website to:

https://raw.githubusercontent.com/gfwlist/gfwlist/master/gfwlist.txt

Click Update Scene Mode at Once. Set mode to proxy in switch rule for the rule list. Click Apply on the left.

![Image](images/6.png?raw=true)

## 4 Test the access
Type www.google.com in Chrome. As first try, you should click the SwitchyOmega plugin icon on top right and select auto switch as your mode. Now test if you can access Google.

![Image](images/7.png?raw=true)

## 5 Have fun!
