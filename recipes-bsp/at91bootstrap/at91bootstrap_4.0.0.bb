require at91bootstrap.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT.txt;md5=12c44f58fe16bd407f016e45950c2f3d"

COMPATIBLE_MACHINE = '(jupiter-nano)'

SRC_URI = "git://github.com/linux4sam/at91bootstrap.git;protocol=https;branch=at91bootstrap-4.x"
SRC_URI += "file://001-add-jupiter-nano-at91bootstrap-config-file.patch"

PV = "4.0.0+git${SRCPV}"
SRCREV = "54f076f5b299b5a72c81d1eca75de5f69fb68d5c"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = 'CROSS_COMPILE=${TARGET_PREFIX} CC=${TARGET_PREFIX}gcc EXTRA_CC_ARGS="${TOOLCHAIN_OPTIONS}"'

AT91BOOTSTRAP_BIN_PATH = "${S}/build/binaries"

AT91BOOTSTRAP_CONFIG_PATH = "${S}/configs"
