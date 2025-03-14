def call() {
    echo "hello"
}

def fun(String name) {
    echo "name = ${name}"
}

def okay() {
    echo "just okay"
}

def createdir(String dirname) {
    sh """
        mkdir -p -m 777 /tmp/${dirname} 
    touch /tmp/${dirname}/okay
    echo "hello" > /tmp/${dirname}/okay
    """
    echo "Directory /root/${dirname} created successfully."
}

def fun2(String name, int s1) {
    return name  // Return only the name
}
