import frequencyanalysis

def main():

    """
    Demonstration of the frequencyanalysis module.
    """

    print("----------------------\n|Frequency Analysis |\n----------------------\n")

    try:
        frequencyanalysis.create_decryption_dictionary("plaintext.txt",
                                                       "encrypted.txt",
                                                       "decryption_dict.json")
    except Exception as e:
        print(e)

    try:
        frequencyanalysis.decrypt_file("encrypted.txt",
                                       "decrypted.txt",
                                       "decryption_dict.json")
    except Exception as e:
        print(e)

#-----------------------------------------------------

main()
