DESCRIPTION = "PETALINUX image definition for Xilinx boards"
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

inherit extrausers
IMAGE_LINGUAS = " "

IMAGE_INSTALL = "\
		kernel-modules \
		mtd-utils \
		bash-completion \
		grep \
		pciutils \
		run-postinsts \
		libgcc \
		libstdc++ \
		glibc-xilinx \
		ldd \
		packagegroup-core-boot \
		lrzsz \
		"
EXTRA_USERS_PARAMS = "usermod -P root root;"
