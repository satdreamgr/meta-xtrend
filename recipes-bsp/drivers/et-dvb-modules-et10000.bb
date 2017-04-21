KV = "4.10.6"
SRCDATE = "20170413"

require et-dvb-modules.inc

SRC_URI = "http://source.mynonpublic.com/xtrend/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "aa6f995a05415e37814ecb2463b2de6c"
SRC_URI[sha256sum] = "850ec9807f6bac596cf3465d489a9d72bb3334e6a159e12ccfd5a73a0caaadba"

COMPATIBLE_MACHINE = "et10000"
