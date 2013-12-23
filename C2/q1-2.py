import sys

def reverse_string(str):
    """
    this function is gonna reverse string
    """
    reversed_string = ""
    for c in reversed(str):
        if c == '\0':
            None
        else:
            reversed_string += c
    reversed_string += '\0'
    print repr(reversed_string)

def main():
    line = sys.argv[1]
    line += '\0'
    print repr(line)
    reverse_string(line)

if __name__ == "__main__":
    main()

