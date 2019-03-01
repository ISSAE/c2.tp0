# Le TP introductif

Si vous avez des problèmes ou des questions

* concernant ce TP le soumette ici [J'ai un Problème](https://github.com/ISSAE/c2.tp0/issues/new) avec un label soit "help wanted" ou "question"
* Concernant le cours c2 en général dans la [classroom](http://classroom.isae.edu.lb)

## <a id="prerequis">[Verifier/installer les pré-requis](travail#prerequis)

1. Installer [git for windows](https://git-scm.com/download/win), openjdk11 et netbeans (c'était un de voir dans http://classroom.isae.edu.lb) 
2. Créer votre compte github avec comme email de référence le votre dans @isae.edu.lb. (c'était un de voir dans http://classroom.isae.edu.lb) 


## <a id="example">[rejoindre la classroom](http://classroom.isae.edu.lb)

_En principe ceci doit être déjà fait!_

Vous avez été invité par votre enseignants, si ce n'est pas le cas remplir [J'ai un Problème](https://github.com/ISSAE/c2.tp0/issues/new) avec un label soit "help wanted" ou "question". Si vous n'avez toujours pas votre compte @isae.edu.lb envoyé un email à webmaster@isae.edu.lb

## <a id="quoi">[Le travail demandé](travail#quoi)

Pour la première fois on va crée une organisation `c2-<centre>-<idcnam>`

### <a id="organisation">[Créer une organisation dans github pour le cours c2](travail#organisation)

Créer une organisation dans github avec votre compte github nommer la **c2-VOTRECENTRE-VOTREIDCNAM** exemple c2-tri-1000t

* **bey** pour Beyrouth
* **tri** pour tripoli
* **nib** pour Nahr Ibrahim
* **bik** pour Bikfaya
* **bal** pour Baalbek

voici une vidéo explicative

<iframe width="560" height="315" src="https://www.youtube.com/embed/oLB7M0JHi9k" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### <a id="fork">[Faire un fork dans votre propre organisation](travail#fork)

Faire un fork de ISSAE/c2.tp0 dans votre organisation nouvellement créée.

<iframe width="560" height="315" src="https://www.youtube.com/embed/3LDVsmFGEEQ" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### <a id="clone">[Cloner en local votre fork](travail#clone)

#### Préparer git en local

Pour une première utilisation: définir les 2 variables d'initialisations nécessaire pour git `

 ```bash
git config --global user.name "Nom prenom"
git config --global user.email <votreemail>@isae.edu.lb 
# exemple
c2@DomicileTerra:~$ git config --global user.name "Etudiant c2"
c2@DomicileTerra:~$ git config --global user.email c2.a@isae.edu.lb
c2@DomicileTerra:~$
```

Générer la clé publique/clé privé ssh
```bash
c2@DomicileTerra:~$ ssh-keygen
Generating public/private rsa key pair.
Enter file in which to save the key (/home/c2/.ssh/id_rsa):
Created directory '/home/c2/.ssh'.
Enter passphrase (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /home/c2/.ssh/id_rsa.
Your public key has been saved in /home/c2/.ssh/id_rsa.pub.
The key fingerprint is:
SHA256:EKD+JU2pReKnxBg5l6KqKoFtvW77QuGCJS1Kn+nj7/4 c2@DomicileTerra
The key's randomart image is:
+---[RSA 2048]----+
|  ..ooo          |
|  +*oo o         |
| oo++ *          |
|+oo..B .         |
|=*oo*.o S        |
|* +=+o           |
|.o.o..           |
|o  o+            |
|+ .+BBoE         |
+----[SHA256]-----+
c2@DomicileTerra:~$
```
voici les 2 clé générées

```bash
c2@DomicileTerra:~$ ls .ssh/
id_rsa  id_rsa.pub
c2@DomicileTerra:~$
```

**copier la clé publique et la déposé dans votre profile github**

Dans le terminal gitbash faire par exemple
```bash
$ clip < ~/.ssh/id_rsa.pub
```

Ceci copies le contenu du fichier id_rsa.pub dans le clipboard

##### Dans le coin supérieur droit de n'importe quelle page du site github.com, cliquez sur la photo de votre profil, puis sur Paramètres.

![Profil github](img/userbar-account-settings.png)

##### Dans la barre latérale des paramètres utilisateur, cliquez sur Clés SSH et GPG.

![side](img/settings-sidebar-ssh-keys.png)
##### Cliquez sur Nouvelle clé SSH ou Ajouter une clé SSH.
![side](img/ssh-add-ssh-key.png)
##### puis finalement paste dans la zone key
![side](img/ssh-key-paste.png)

#### Maintenant faire clone

git clone <url de votre dépot que vous avez forké plus haut>

voir cette petite vidéo explicative
<iframe width="560" height="315" src="https://www.youtube.com/embed/HSvQAsBdKnc" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### Créer un projet avec blueJ dans le répertoire c2.tp0 que vous avez récupérer après le clone

1. Lancer BlueJ, 
2. créer des classes (des fichiers), 
2. faire une nouvelle version: git add git commit

Voir les instructions dans cette vidéo
<iframe width="560" height="315" src="https://www.youtube.com/embed/YzpfP1mTm6U" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

#### Processus git ...
![git1](img/gitSequences.png)
![git2](img/etatDepot.png)

### <a id="jnews">[Maintenant un peu de java, créer la classe Customer.java](travail#jnews)

La classe Customer représente un client; elle possède les attributs suivants, tous de type String : 
```java
    private String _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _street1;
    private String _street2;
    private String _city;
    private String _state;
    private String _zipcode;
    private String _country;
    private String _mail;
```
Elle propose aussi, dans cette première version, des méthodes statiques (find, insert, remove) gérant (par exemple dans une HashMap associant l'id d'un Customer et son instance) l'ensemble de ses instances.

1) le squelette d'un projet maven se trouve dans le répertoire [SourceTP0](SourceTP0/) de ce dépôt; qu'en principe vous avec 1. forké puis 2. cloné en local...

2) Développez la classe Customer en entier et faites marcher les test unitaires (mvn test) c'est du TDD (Test Driven Développement)

3) Une fois l'application mise au point `"mvn test"` réussi, faire push de votre travail 

### <a id="push">[Finir en faisan push dans votre fork](travail#push)

git push .... 

### <a id="avertir">[Avertir l'enseignant dans la classroom de la fin du travail](travail#avertir)

### <a id="pullrequest">[optionnellement faire un pull request](travail#pullrequest)

